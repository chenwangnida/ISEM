:- use_module(library(ordsets)).
:- use_module(library(ugraphs)).
:- use_module(library(lists)).
:- use_module(library(terms)).

%The deterministic $\theta$-subsumption algorithm is implemented in Prolog. 
% The top level subsumption predicate is called \textit{det\_subsume}, and 
% succeeds only if the given input clauses subsume each other. 
%
% A clause is represented as a lists of terms in Prolog. 
%
% For testing $C \theta \subseteq D$, the literals in $D$ are first made
% ground using the \textit{numvars} predicate. We then attempt to unify
% each literal in C with a literal in D, using backtracking as necessary. 
% This is achieved with the \textit{subset} predicate, which tests if clause
% $C$ is a subset of $D$. It is important that $D$ is ground since when
% unifying a literal in $C$ to one in $D$, we only want to apply a
% substitution to the literal in $C$.
%
% The top level deterministic subsumption predicate \textit{det\_subsume}
% first finds deterministically matching literals in $C$, and then checks
% if the remaining non-deterministically matching literals in C subsume D.
%
% The \textit{det\_subsume1} predicate separates the literals in $C$ to those
% which deterministically and those which non-deterministically match in $D$.
% Then \textit{subset} checks if the non-deterministically matching literals
% in $C$ and $NDet$ subsume $D$.

det_subsume(C, D) :- numvars(D, 0, _), det_subsume1(C, D, _Det, NDet), !, subset(NDet, D), !.

%Unifies deterministic matches
det_subsume1([], _, [], []) :- !.
det_subsume1([HC|TC], D, Det, NDet) :- matches(HC, D, 0, N), !, (N = 0, fail; N = 1, Det = [HC|Det1], NDet = NDet1; N > 1, NDet = [HC|NDet1], Det = Det1), det_subsume1(TC, D, Det1, NDet1), !.

%Check is a literal deterministically matches one in clause
%match(L, Cl, Counter, Num). Num is the number of matches in the clause
%If a deterministic match is found then unify it with the literal
matches(_, [], C, C) :- !.
matches(_, _, 2, 2) :- !.    %If 2 matches found, non deterministic
matches(L, [H|T], Ctr, N) :- L \= H, !, matches(L, T, Ctr, N).
matches(L, [H|T], Ctr, N) :- Ctr1 is Ctr+1, matches(L, T, Ctr1, N), !, (N = 1, H = L; N \= 1).

%Checks that first arg is subset of second
subset([],_) :- !.
subset([L1|T1],C2) :- member(L1,C2), subset(T1,C2).

numvar(V,N,M) :- var(V), !, V = '$'(N), M is N + 1.
numvar(T,N,M) :- T =.. [_|L], numvars(L,N,M), !.

numvars([],N,N).
numvars([H|T],N,M) :- numvar(H,N,N1), numvars(T,N1,M), !.

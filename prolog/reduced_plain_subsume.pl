:- use_module(library(ordsets)).
:- use_module(library(ugraphs)).
:- use_module(library(lists)).
:- use_module(library(terms)).
:- load_files([plain_subsume], [if(changed)]).

%===================Reduced Plain Subsumption ==============================
red_p_subsume(C, D) :- creduce(C, C1), plain_subsume(C1, D).

creduce(C1,C2) :- copy_term(C1, C3), rem1(C3,C4), \+ \+ subsume(C1,C4), !, creduce(C4,C2), !.
creduce(C1,C1) :- !.

rem1([_|T1],T1).
rem1([H1|T1],[H1|T2]) :- rem1(T1,T2).

subsume(C1,C2) :- nv(C2, 0, _), !, matchall(C1, C2), !.

nv(V,N,M) :- var(V), !, V = '$'(N), M is N + 1.
nv(T,N,M) :- T =.. [_|L], nvs(L,N,M), !.

nvs([],N,N).
nvs([H|T],N,M) :- nv(H,N,N1), nvs(T,N1,M), !.

matchall([],_) :- !.
matchall([L1|T1],C2) :- member(L1,C2), matchall(T1,C2).
:- use_module(library(ordsets)).
:- use_module(library(ugraphs)).
:- use_module(library(lists)).
:- use_module(library(terms)).

%================== Plain Subsumption ======================================

%Numbervars makes the variables in C2 ground.
plain_subsume(C1,C2) :- numvars(C2,0,_), !, subset(C1,C2), !.

%Checks that first arg is subset of second
subset([],_) :- !.
subset([L1|T1],C2) :- member(L1,C2), subset(T1,C2).

numvar(V,N,M) :- var(V), !, V = '$'(N), M is N + 1.
numvar(T,N,M) :- T =.. [_|L], numvars(L,N,M), !.

numvars([],N,N).
numvars([H|T],N,M) :- numvar(H,N,N1), numvars(T,N1,M), !.
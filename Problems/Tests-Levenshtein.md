# Levenshtein Distance

Here are some tests for the Levenshtein problem.  I have done the problem beyond what is required for my students.  I was challenged by my friend to do so.  Anyway.  The Levenshtein problem for my students is merely to find if there is a path from one word to the next following the rules of adding or subtracting or changing one letter at a time.  The tests that I performed and that are listed give the shortest distances and list those shortest distances.  One of the most interesting transformations is monkey -> business.  By the way, the answers might be different if you use a different dictionary.

Make sure to test some words that have no path between them too.

category -> categories

As you can see in the results, my algorithm is not very time efficient.  But I leave those times in for those who might be interested in comparing their times with mine.

Summary:

Distance | Number of shortest paths
---------|-------------------------
Levenshtein Distance from dog to cat is 3 | Shortest Paths: 6
Levenshtein Distance from cat to dog is 3 | Shortest Paths: 6
Levenshtein Distance from puppy to dog is 6 | Shortest Paths: 38
Levenshtein Distance from dog to smart is 5 | Shortest Paths: 51
Levenshtein Distance from dog to quack is 7 | Shortest Paths: 107
Levenshtein Distance from monkey to business is 13 | Shortest Paths: 1

Levenshtein Distance from dog to cat is 3

time: 15703.301474 ms

All shortest paths:
-------|
dog -> dag -> dat -> cat |
dog -> dot -> cot -> cat |
dog -> dag -> cag -> cat |
dog -> cog -> cot -> cat |
dog -> dot -> dat -> cat |
dog -> cog -> cag -> cat |

Shortest Paths: 6

Map size: 4575

Levenshtein Distance from cat to dog is 3

time: 24815.761561 ms

All shortest paths:
-------|
cat -> dat -> dot -> dog |
cat -> cag -> dag -> dog |
cat -> dat -> dag -> dog |
cat -> cot -> dot -> dog |
cat -> cag -> cog -> dog |
cat -> cot -> cog -> dog |

Shortest Paths: 6

Map size: 8289

Levenshtein Distance from puppy to dog is 6

time: 185795.471987 ms

All shortest paths:
-------|
puppy -> poppy -> popsy -> posy -> pos -> dos -> dog |
puppy -> pulpy -> pulp -> pul -> pol -> dol -> dog |
puppy -> poppy -> moppy -> mopy -> moy -> mog -> dog |
puppy -> pulpy -> pulp -> pup -> pug -> dug -> dog |
puppy -> duppy -> dumpy -> dump -> dup -> dop -> dog |
puppy -> pulpy -> puly -> pul -> pol -> dol -> dog |
puppy -> poppy -> popsy -> pops -> pop -> dop -> dog |
puppy -> cuppy -> coppy -> copy -> dopy -> dop -> dog |
puppy -> poppy -> coppy -> copy -> dopy -> dop -> dog |
puppy -> duppy -> dumpy -> dump -> dup -> dug -> dog |
puppy -> pulpy -> pulp -> pup -> dup -> dop -> dog |
puppy -> pulpy -> puly -> poly -> pogy -> dogy -> dog |
puppy -> poppy -> coppy -> copy -> coy -> cog -> dog |
puppy -> poppy -> coppy -> copy -> dopy -> dogy -> dog |
puppy -> poppy -> moppy -> mopy -> mop -> mog -> dog |
puppy -> pippy -> pipy -> pip -> dip -> dig -> dog |
puppy -> pulpy -> pulp -> pup -> dup -> dug -> dog |
puppy -> pulpy -> pulp -> pup -> pop -> dop -> dog |
puppy -> pippy -> pipy -> pip -> pig -> dig -> dog |
puppy -> poppy -> moppy -> mopy -> dopy -> dogy -> dog |
puppy -> cuppy -> coppy -> copy -> coy -> cog -> dog |
puppy -> pulpy -> puly -> pul -> pug -> dug -> dog |
puppy -> pulpy -> puly -> puy -> pug -> dug -> dog |
puppy -> poppy -> moppy -> mopy -> mop -> dop -> dog |
puppy -> cuppy -> coppy -> copy -> dopy -> dogy -> dog |
puppy -> duppy -> dumpy -> dump -> dum -> dom -> dog |
puppy -> pulpy -> pulp -> pul -> pug -> dug -> dog |
puppy -> pulpy -> puly -> poly -> pol -> dol -> dog |
puppy -> pippy -> pipy -> pip -> pop -> dop -> dog |
puppy -> cuppy -> coppy -> copy -> cop -> dop -> dog |
puppy -> pippy -> pipy -> pip -> dip -> dop -> dog |
puppy -> poppy -> moppy -> mopy -> dopy -> dop -> dog |
puppy -> poppy -> coppy -> copy -> cop -> dop -> dog |
puppy -> poppy -> coppy -> copy -> cop -> cog -> dog |
puppy -> poppy -> popsy -> pops -> pos -> dos -> dog |
puppy -> cuppy -> coppy -> copy -> cop -> cog -> dog |
puppy -> duppy -> dumpy -> dump -> dum -> dug -> dog |
puppy -> poppy -> popsy -> posy -> pogy -> dogy -> dog |

Shortest Paths: 38

Map size: 22457

Levenshtein Distance from dog to smart is 5

time: 189735.666912 ms

All shortest paths:
-------|
dog -> dot -> sot -> sort -> sart -> smart |
dog -> sog -> sot -> sort -> sart -> smart |
dog -> sog -> sot -> sat -> sart -> smart |
dog -> mog -> mot -> mat -> mart -> smart |
dog -> dot -> sot -> sat -> sart -> smart |
dog -> dor -> dort -> dart -> mart -> smart |
dog -> dag -> darg -> marg -> mart -> smart |
dog -> dor -> dar -> dart -> mart -> smart |
dog -> mog -> mag -> marg -> mart -> smart |
dog -> dag -> mag -> mat -> mart -> smart |
dog -> dot -> mot -> mort -> mart -> smart |
dog -> dot -> dat -> sat -> sart -> smart |
dog -> dor -> dar -> dart -> sart -> smart |
dog -> dag -> mag -> marg -> mart -> smart |
dog -> dot -> dort -> dart -> sart -> smart |
dog -> mog -> mag -> mat -> mart -> smart |
dog -> dag -> dat -> dart -> sart -> smart |
dog -> dot -> dat -> dart -> mart -> smart |
dog -> sog -> sag -> sat -> sart -> smart |
dog -> dor -> dar -> sar -> sart -> smart |
dog -> dor -> dort -> dart -> sart -> smart |
dog -> dor -> dar -> mar -> mart -> smart |
dog -> mog -> mag -> mar -> mart -> smart |
dog -> dag -> dat -> mat -> mart -> smart |
dog -> dag -> darg -> dart -> sart -> smart |
dog -> dot -> dat -> dart -> sart -> smart |
dog -> dag -> dar -> dart -> mart -> smart |
dog -> dag -> mag -> mar -> mart -> smart |
dog -> mog -> mot -> mort -> mart -> smart |
dog -> dor -> dort -> mort -> mart -> smart |
dog -> dot -> dort -> dart -> mart -> smart |
dog -> mog -> mor -> mort -> mart -> smart |
dog -> sog -> sag -> sar -> sart -> smart |
dog -> dag -> sag -> sat -> sart -> smart |
dog -> mog -> morg -> marg -> mart -> smart |
dog -> dot -> dat -> mat -> mart -> smart |
dog -> dot -> dort -> mort -> mart -> smart |
dog -> dot -> dort -> sort -> sart -> smart |
dog -> dor -> mor -> mar -> mart -> smart |
dog -> dag -> dat -> sat -> sart -> smart |
dog -> dag -> dar -> sar -> sart -> smart |
dog -> mog -> mor -> mar -> mart -> smart |
dog -> mog -> morg -> mort -> mart -> smart |
dog -> dor -> mor -> mort -> mart -> smart |
dog -> dot -> mot -> mat -> mart -> smart |
dog -> dag -> dar -> mar -> mart -> smart |
dog -> dag -> dat -> dart -> mart -> smart |
dog -> dag -> dar -> dart -> sart -> smart |
dog -> dor -> dort -> sort -> sart -> smart |
dog -> dag -> darg -> dart -> mart -> smart |
dog -> dag -> sag -> sar -> sart -> smart |

Shortest Paths: 51

Map size: 32155

Levenshtein Distance from dog to quack is 7

time: 1732498.366852 ms

All shortest paths:
-------|
dog -> do -> du -> qu -> qua -> quar -> quark -> quack |
dog -> dug -> due -> que -> qua -> quaw -> quawk -> quack |
dog -> doa -> koa -> kua -> kuar -> quar -> quark -> quack |
dog -> tog -> tug -> tua -> qua -> quar -> quark -> quack |
dog -> doc -> boc -> bock -> bick -> buick -> quick -> quack |
dog -> do -> duo -> quo -> qua -> quar -> quark -> quack |
dog -> dor -> gor -> gar -> guar -> quar -> quark -> quack |
dog -> dag -> dad -> duad -> quad -> quaw -> quawk -> quack |
dog -> dug -> dui -> qui -> quai -> quar -> quark -> quack |
dog -> dug -> dun -> duan -> quan -> quar -> quark -> quack |
dog -> dos -> duos -> quos -> quor -> quar -> quark -> quack |
dog -> doa -> toa -> tua -> qua -> quar -> quark -> quack |
dog -> dot -> dat -> qat -> quat -> quart -> quark -> quack |
dog -> dong -> dung -> qung -> quag -> quar -> quark -> quack |
dog -> dag -> gag -> gar -> guar -> quar -> quark -> quack |
dog -> dug -> tug -> tua -> qua -> quaw -> quawk -> quack |
dog -> doa -> poa -> pua -> qua -> quar -> quark -> quack |
dog -> doe -> due -> que -> quae -> quaw -> quawk -> quack |
dog -> dug -> dung -> qung -> quag -> quar -> quark -> quack |
dog -> doc -> dock -> bock -> bick -> buick -> quick -> quack |
dog -> dod -> dud -> duad -> quad -> quar -> quark -> quack |
dog -> doc -> dock -> bock -> buck -> buick -> quick -> quack |
dog -> dug -> dung -> qung -> quag -> quaw -> quawk -> quack |
dog -> dug -> dud -> duad -> quad -> quar -> quark -> quack |
dog -> doe -> due -> que -> quae -> quar -> quark -> quack |
dog -> don -> dan -> duan -> quan -> quaw -> quawk -> quack |
dog -> doo -> duo -> quo -> quor -> quar -> quark -> quack |
dog -> dg -> du -> qu -> qua -> quar -> quark -> quack |
dog -> dag -> dar -> gar -> guar -> quar -> quark -> quack |
dog -> dor -> gor -> gur -> guar -> quar -> quark -> quack |
dog -> dug -> dui -> qui -> quia -> quica -> quick -> quack |
dog -> doo -> duo -> quo -> qua -> quaw -> quawk -> quack |
dog -> dag -> dat -> qat -> quat -> quar -> quark -> quack |
dog -> dag -> dan -> duan -> quan -> quaw -> quawk -> quack |
dog -> dug -> duo -> quo -> quor -> quar -> quark -> quack |
dog -> tog -> toa -> tua -> qua -> quar -> quark -> quack |
dog -> doc -> boc -> bock -> buck -> buick -> quick -> quack |
dog -> dag -> dal -> dual -> qual -> quaw -> quawk -> quack |
dog -> don -> dun -> duan -> quan -> quaw -> quawk -> quack |
dog -> doc -> dock -> duck -> buck -> buick -> quick -> quack |
dog -> do -> duo -> quo -> qua -> quaw -> quawk -> quack |
dog -> dol -> dal -> dual -> qual -> quarl -> quark -> quack |
dog -> don -> dan -> duan -> quan -> quar -> quark -> quack |
dog -> dot -> dat -> qat -> quat -> quar -> quark -> quack |
dog -> dug -> due -> que -> quae -> quar -> quark -> quack |
dog -> doe -> due -> que -> qua -> quar -> quark -> quack |
dog -> gog -> gag -> gar -> guar -> quar -> quark -> quack |
dog -> doo -> duo -> quo -> qua -> quar -> quark -> quack |
dog -> dag -> dat -> qat -> quat -> quaw -> quawk -> quack |
dog -> tog -> tug -> tua -> qua -> quaw -> quawk -> quack |
dog -> dug -> duo -> quo -> qua -> quaw -> quawk -> quack |
dog -> doe -> due -> que -> quae -> quare -> quark -> quack |
dog -> dug -> duo -> quo -> qua -> quar -> quark -> quack |
dog -> doa -> koa -> kua -> qua -> quar -> quark -> quack |
dog -> dag -> dal -> dual -> qual -> quar -> quark -> quack |
dog -> dug -> dui -> qui -> quai -> quaw -> quawk -> quack |
dog -> dug -> due -> que -> quae -> quaw -> quawk -> quack |
dog -> dug -> dun -> duan -> quan -> quaw -> quawk -> quack |
dog -> dol -> dal -> dual -> qual -> quar -> quark -> quack |
dog -> doa -> goa -> goar -> guar -> quar -> quark -> quack |
dog -> doa -> toa -> tua -> qua -> quaw -> quawk -> quack |
dog -> dug -> due -> que -> qua -> quar -> quark -> quack |
dog -> dg -> du -> qu -> qua -> quaw -> quawk -> quack |
dog -> dug -> pug -> pua -> qua -> quaw -> quawk -> quack |
dog -> dod -> dad -> duad -> quad -> quaw -> quawk -> quack |
dog -> doe -> due -> que -> qua -> quaw -> quawk -> quack |
dog -> rog -> rug -> rua -> qua -> quaw -> quawk -> quack |
dog -> dug -> rug -> rua -> qua -> quaw -> quawk -> quack |
dog -> gog -> gor -> gar -> guar -> quar -> quark -> quack |
dog -> dug -> dui -> qui -> qua -> quar -> quark -> quack |
dog -> gog -> goa -> goar -> guar -> quar -> quark -> quack |
dog -> doa -> poa -> pua -> qua -> quaw -> quawk -> quack |
dog -> gog -> gor -> goar -> guar -> quar -> quark -> quack |
dog -> dag -> dad -> duad -> quad -> quar -> quark -> quack |
dog -> dug -> du -> qu -> qua -> quar -> quark -> quack |
dog -> dug -> tug -> tua -> qua -> quar -> quark -> quack |
dog -> dug -> dui -> qui -> quin -> quink -> quick -> quack |
dog -> doa -> koa -> kua -> qua -> quaw -> quawk -> quack |
dog -> rog -> rug -> rua -> qua -> quar -> quark -> quack |
dog -> doc -> duc -> duck -> buck -> buick -> quick -> quack |
dog -> dug -> duc -> duck -> buck -> buick -> quick -> quack |
dog -> dot -> dat -> qat -> quat -> quaw -> quawk -> quack |
dog -> dong -> dung -> qung -> quag -> quaw -> quawk -> quack |
dog -> dor -> dar -> gar -> guar -> quar -> quark -> quack |
dog -> dor -> gor -> goar -> guar -> quar -> quark -> quack |
dog -> doc -> dock -> dick -> bick -> buick -> quick -> quack |
dog -> dug -> dud -> duad -> quad -> quaw -> quawk -> quack |
dog -> don -> dun -> duan -> quan -> quar -> quark -> quack |
dog -> dug -> rug -> rua -> qua -> quar -> quark -> quack |
dog -> dol -> dal -> dual -> qual -> quaw -> quawk -> quack |
dog -> dod -> dad -> duad -> quad -> quar -> quark -> quack |
dog -> dor -> dur -> gur -> guar -> quar -> quark -> quack |
dog -> bog -> boc -> bock -> buck -> buick -> quick -> quack |
dog -> dag -> dat -> qat -> quat -> quart -> quark -> quack |
dog -> tog -> toa -> tua -> qua -> quaw -> quawk -> quack |
dog -> dug -> du -> qu -> qua -> quaw -> quawk -> quack |
dog -> gog -> gor -> gur -> guar -> quar -> quark -> quack |
dog -> dug -> dui -> qui -> qua -> quaw -> quawk -> quack |
dog -> dug -> pug -> pua -> qua -> quar -> quark -> quack |
dog -> dod -> dud -> duad -> quad -> quaw -> quawk -> quack |
dog -> dag -> dal -> dual -> qual -> quarl -> quark -> quack |
dog -> do -> duo -> quo -> quor -> quar -> quark -> quack |
dog -> dag -> dan -> duan -> quan -> quar -> quark -> quack |
dog -> dug -> dur -> gur -> guar -> quar -> quark -> quack |
dog -> do -> du -> qu -> qua -> quaw -> quawk -> quack |
dog -> dug -> due -> que -> quae -> quare -> quark -> quack |
dog -> bog -> boc -> bock -> bick -> buick -> quick -> quack |

Shortest Paths: 107

Map size: 63678

Levenshtein Distance from monkey to business is 13

time: 2814028.051959 ms

All shortest paths:
-------|
monkey -> money -> coney -> cones -> cines -> chines -> chinese -> achinese -> achiness -> ashiness -> mashiness -> mushiness -> bushiness -> business |

Shortest Paths: 1

Map size: 102500

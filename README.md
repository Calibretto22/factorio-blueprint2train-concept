# factorio-blueprint2train-concept

the goal is to create a webinterface where the user can input a factorio-blueprint and gets back another blueprint with a constant combinator (CC). 

the constant combinator sends out the specific ammount of items that are needed to construct the given blueprint. 

if the blueprint requires more items than fit into one trainwagon, then multiple rows of CCs are returned. 
if the blueprint contains more different items than can be sent with one CC, multiple cloumns of CCs are returned. 

optional: input and parsing of a itemlist instead of a blueprint (define format)
optional: detection and parsing of a url (pastebin, hastebin, $bin)
optional: prioritisation of items for optimal buildup (robots, ports & electricity first | assemblers, smelters & inserters last)
optional: prioritisation of last wagon, first wagon only contains most important buildup-components

this project is my first own programming project, my first steps on github, with eclipse, with java ... with almost everything. 

i'm learning everything from scratch. 
so criticism and hints are very welcome, but feature-requests may be postponed for several years. 

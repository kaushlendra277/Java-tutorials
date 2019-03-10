From Java 8 we get some addidtional utility in Map(I)
 1. compute(key, BiFunctional<key Type, value Type, value Type>)
   #######without compute(refer MapJava8Api.asPerPreJava8 method)
		  if(map.contaninsKey(someKey))// or if(map.putIfAbsent(someKey) == null)
		   // do manipulation or modification of the existing Entry
		  else
		   // add entry to the map
   
   #######with compute(refer MapJava8Api.asPerJava8Compute method)
 	//above 4 lines can be simply replaced as 
 		 map.compute(someKey, (k,v) -> v == null? 1: v+1)
 		 
  2. computeIfAbsent (key, Function<valueType, valueType>)
  	- this used to add entry to map if key is not present
  	- it function same as putIfAbsent()
  3. computeIfPresent(key, BiFunctional<key Type, value Type, value Type>)
    - this used to manipulate or modify existing entry within a map 
    
    Note : compute = computeIfAbsent + computeIfPresent
    
  4. [MOST-PREFERRED]merge(someKey, valueModificationVar , BiFunctional<value Type, value Type, value Type>)
   - compute method is good but merge is more flexible
   - using compute "remappingFunction" takes key type in consideration,
     BUT using merge "remappingFunction" takes only value type
   - refer(MapJava8Api.asPerJava8Merge) 
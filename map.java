public Map<Integer,Integer> calculateDegree(UndirectedGraphNode node){
                Map<Integer,Integer> map = new HashMap<Integer,Integer>();
                
                if (node == null){
                        return map;
                }
                // bfs
                Set<UndirectedGraphNode> visited = new HashSet<UndirectedGraphNode>();
               
                Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
                queue.offer(node);
                
                UndirectedGraphNode curr;
                int size,i;
                while (queue.size() > 0){
                        curr = queue.poll();
                        if (visited.contains(curr)){
                                continue;
                        }
                        size = curr.neighbors.size();
                        
                        if (!map.containsKey(size)){
                                map.put(size, 1);
                        };
                        else{ 
                                map.put(size, map.get(size)+1);
                        }
                        
                        visited.add(curr);
                        
                        for (i=0;i<size;i++){
                                if (!visited.contains(curr.neighbors.get(i))){
                                        queue.offer(curr.neighbors.get(i));
                                };
                        }
                }
               
                return map;
        }

# Java Collection Framework

## Overview
The Java Collection Framework is a unified architecture for representing and manipulating collections of objects. It provides interfaces, implementations, and algorithms to work with groups of objects efficiently.

## Core Interfaces

### Collection
- Root interface for all collection types
- Methods: `add()`, `remove()`, `contains()`, `size()`, `isEmpty()`

### List
- Ordered collection allowing duplicates
- Implementations: `ArrayList`, `LinkedList`, `Vector`
- Key methods: `get(int index)`, `set(int index, E element)`, `add(int index, E element)`

### Set
- Unordered collection of unique elements
- Implementations: `HashSet`, `LinkedHashSet`, `TreeSet`
- Key methods: `add()`, `remove()`, `contains()`

### Map
- Collection of key-value pairs
- Implementations: `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable`
- Key methods: `put(K key, V value)`, `get(Object key)`, `remove(Object key)`

### Queue
- FIFO (First-In-First-Out) or priority-based collections
- Implementations: `LinkedList`, `PriorityQueue`, `Deque`
- Key methods: `offer()`, `poll()`, `peek()`

## Common Implementations

| Interface | Class | Ordered | Unique | Sorted | Thread-Safe |
|-----------|-------|---------|--------|--------|-------------|
| List | ArrayList | Yes | No | No | No |
| List | LinkedList | Yes | No | No | No |
| Set | HashSet | No | Yes | No | No |
| Set | LinkedHashSet | Yes | Yes | No | No |
| Set | TreeSet | Yes | Yes | Yes | No |
| Map | HashMap | No | Keys Unique | No | No |
| Map | LinkedHashMap | Yes | Keys Unique | No | No |
| Map | TreeMap | Yes | Keys Unique | Yes | No |

## Usage Examples

### ArrayList
```java
List<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");
list.get(0);
```

### HashSet
```java
Set<Integer> set = new HashSet<>();
set.add(1);
set.add(2);
set.contains(1);
```

### HashMap
```java
Map<String, Integer> map = new HashMap<>();
map.put("key1", 100);
map.get("key1");
```

## Key Characteristics

- **Ordered vs Unordered**: Some collections maintain insertion order
- **Duplicates**: Lists allow duplicates; Sets don't
- **Sorting**: TreeSet and TreeMap automatically sort elements
- **Thread Safety**: Legacy classes like Vector and Hashtable are synchronized
- **Performance**: ArrayList is faster for random access; LinkedList for insertions/deletions

## Hierarchy
```
Collection
├── List (ArrayList, LinkedList)
├── Set (HashSet, TreeSet, LinkedHashSet)
└── Queue (PriorityQueue, Deque)

Map (HashMap, TreeMap, LinkedHashMap)
```

## Best Practices

1. Use ArrayList for most list operations
2. Use HashMap for key-value storage
3. Use HashSet for unique element storage
4. Use TreeSet/TreeMap for sorted collections
5. Use immutable collections when appropriate
6. Avoid raw types; use generics

## Resources

- [Java Collections Documentation](https://docs.oracle.com/javase/tutorial/collections/)
- [Collection Interface Hierarchy](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html)

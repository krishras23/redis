# Redis

## Advantages

* Faster relational database (data is read and modified from RAM rather than main memory disk)
* Every piece of data uses key value pair 
* Can act as a cache [middle layer] between database 

## Applications

Real Time Analytics, Chatting, Social Media, Live leaderboards, Geopositioning 

## Commands 

*lsof -i tcp:6379
* kill -9 <pid>
* brew services stop redis
* docker run -d -p 6379:6379 --name myredis redis

### Strings
* SET key value: Set the value of a key
* GET key: Get the value of a key
* DEL key [key ...]: Delete one or more keys
* INCR key: Increment the integer value of a key
* DECR key: Decrement the integer value of a key
* APPEND key value: Append a value to a key


### Hashes
* HSET key field value: Set the value of a field in a hash 
* HGET key field: Get the value of a field in a hash
* HGETALL key: Get all the fields and values in a hash
* HDEL key field [field ...]: Delete one or more fields from a hash
* HKEYS key: Get all the fields in a hash
* HVALS key: Get all the values in a hash


### Lists
* LPUSH key value [value ...]: Insert one or more values at the beginning of a list
* RPUSH key value [value ...]: Insert one or more values at the end of a list
* LPOP key: Remove and return the first element of a list
* RPOP key: Remove and return the last element of a list
* LRANGE key start stop: Get a range of elements from a list by their index

### Sets
* SADD key member [member ...]: Add one or more members to a set
* SMEMBERS key: Get all the members of a set
* SISMEMBER key member: Check if a member exists in a set
* SREM key member [member ...]: Remove one or more members from a set
* SCARD key: Get the number of members in a set

### Sorted Sets

* ZADD key score member [score member ...]
* ZRANGE key start stop [WITHSCORES]: Get a range of members from a sorted set by their rank, optionally with their scores
* ZREVRANGE key start stop [WITHSCORES]: Get a range of members from a sorted set by their rank, in reverse order, optionally with their scores
* ZCARD key: Get the number of members in a sorted set
* ZSCORE key member: Get the score of a member in a sorted set
* ZREM key member [member ...]: Remove one or more members from a sorted set


### Transactions 

* MULTI
* [list of commands]
* EXEC



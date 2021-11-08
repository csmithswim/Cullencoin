Java application that generates and validates the chain and blocks. 

Generate and print n number of blocks ->

PRINT "Block:\n"
PRINT "Id: "
GENERATE/INCREMENT/PRINT unique ID for each block + "\n"
PRINT "Timestamp: "
PRINT localDateTime in ms + "\n"
PRINT "Hash of the previous block:\n"
PRINT block(n-1)'s hash value + "\n"
REPEAT n number of times




First stage: 
[]Generate 5 different blocks.
    []method to create a block
        uses a hash function to hash a value
        use timestamp, id and previous hash to generate         new hash?
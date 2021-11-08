package com.blockchain;

public class Block {

    //Block should have Long timeStamp, int id, String hashValue

    protected long timeStamp;
    protected int id;
    protected String hashValue;

    Block(long timeStamp, int id, String hashValue) {
        this.timeStamp = timeStamp;
        this.id = id;
        this.hashValue = hashValue;
    }


}

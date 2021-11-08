package com.blockchain;
import java.util.Date;

public class Blockchain implements StringUtil {

    private int blockId = 0;

    //validate a block

    //Block generateBlock
    //increment a block
    //timestamp a block
    //generate a block

//    private String

    private long generateTimeStamp() {
        return new Date().getTime();
    }

    private int incrementId() {
       return blockId++;
    }

    protected Block generateBlock() {
        long timeStamp = generateTimeStamp();
        int id = incrementId();

        Block block = new Block(timeStamp, id, StringUtil.applySha256(String.valueOf(timeStamp) + String.valueOf(id)));
        return block;
    }

    @Override
    public String toString() {
        return "Blockchain{" +
                "blockId=" + blockId +
                '}';
    }
}

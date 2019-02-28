package org.bitcorej.chain.bitcoin;

public class UnspentOutput {
    private String txId;
    private int vout;
    private String address;
    private byte[] scriptPubKey;
    private long amount;

    public UnspentOutput(String txId, int vout, String address, byte[] scriptPubKey, long amount) {
        this.txId = txId;
        this.vout = vout;
        this.address = address;
        this.scriptPubKey = scriptPubKey;
        this.amount = amount;
    }

    public String getTxId() {
        return txId;
    }

    public int getVout() {
        return vout;
    }

    public String getAddress() {
        return address;
    }

    public byte[] getScriptPubKey() {
        return scriptPubKey;
    }

    public long getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return this.txId + ':' + this.vout;
    }
}

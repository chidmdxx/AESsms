package mx.sekureco.aes;

/**
 * Created by Rachid on 4/15/2014.
 */
public class Word {
    private byte[] bytes;

    public Word() {
        bytes = new byte[4];
    }

    public Word(byte[] a) {
        bytes = new byte[4];
        Set(a);
    }

    public Word(byte a, byte b, byte c, byte d) {
        bytes = new byte[4];
        bytes[0] = a;
        bytes[1] = b;
        bytes[2] = c;
        bytes[3] = d;
    }

    public byte Get(int pos) {
        return bytes[pos];
    }

    public void Set(byte[] a) {
        for (int i = 0; i < 4; i++) {
            bytes[i] = a[i];
        }
    }

    public void Set(byte a, int pos) {
        bytes[pos] = a;
    }

    public void RotWord() {
        byte first = bytes[0];

        bytes[0] = bytes[1];
        bytes[1] = bytes[2];
        bytes[2] = bytes[3];
        bytes[3] = first;
    }

    public void Rcon(byte rcon){
        bytes[0]=(byte)(bytes[0]^rcon);
    }

    public static Word XOR(Word a,Word b)
    {
        byte[] newBytes=new byte[4];

        for(int i=0;i<4;i++)
        {
            newBytes[i]=(byte)(a.Get(i)^b.Get(i));
        }

        return new Word(newBytes);
    }
}

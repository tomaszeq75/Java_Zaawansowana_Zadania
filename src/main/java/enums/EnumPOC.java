package enums;

public class EnumPOC {

    //stary spsob tworenia stalych 'wyliczeniowych'
    public static final String STATUS_ONLINE = "online";
    public static final String statusOffline = "offline";
    public static final int statusCodeSucces = 2;

    public static void main(String[] args) {

        System.out.println(Status.ONLINE);

        System.out.println(Transport.CAR);
        System.out.println(Transport.CAR.getSpeed());

        Transport enum1 = Transport.CAR;
        Transport enum2 = Transport.TIR;

        //porownanie enum
        System.out.println(enum1.equals(enum2));
        //porownanie cechy enum
        System.out.println(enum1.isTheSameCode(enum2));

    }

}

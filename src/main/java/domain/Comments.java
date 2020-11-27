package domain;

import javax.xml.crypto.Data;

public class Comments {
    private int idComments;//id омментария
    private int idOwner;//id автора или группы написавшей комментарий
    private String imageIcon;//иконка автора или группы написавшей комментарий
    private int name;//имя автора или название группы написавшей комментарий
    private Data data;
    private String text;
}
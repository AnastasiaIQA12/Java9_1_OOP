package domain.attachment;

public class Poll {
    private int id;
    private int idOwnwer;
    private int created;
    private String question;
    private int votes;
    private Answer[] answers;
    private boolean anonymous;
    private boolean multiple;
    private int idsAnswer;
    private int endDate;
    private boolean closed;
    private boolean isBoard;
    private boolean canEdit;
    private  boolean canVote;
    private  boolean canReport;
    private boolean canShare;
    private int idAuthor;
    private Photo photo;
    private Background background;
    private int friends;
}

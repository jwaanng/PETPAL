package FavPetPage.BrowsePet;

public class BPController {
    BPIB uci;

    public BPController(BPIB browsePetUsecaseInteracter){
        uci = browsePetUsecaseInteracter;
    }

    public void execute(){
        uci.execute();
    }
}
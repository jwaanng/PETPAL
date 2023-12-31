package favPetPage.myFavPetPageRedirect;

/**
 * A concrete implementation of {@link FavPetRDRIB}
 * <p>
 * An implementation of a myFavPetPageRedirect usecase interactor that redirects a user to the favorite pet page
 */
public class FavPetRDRUCI implements FavPetRDRIB {
    private final FavPetRDROB presenter;

    /**
     * Construct a new usecase interactor
     *
     * @param favPetRDROutputBoundary a presenter implementing {@link FavPetRDROB} that is called by the interactor
     *                                to finish usecase
     */
    public FavPetRDRUCI(FavPetRDROB favPetRDROutputBoundary) {
        this.presenter = favPetRDROutputBoundary;
    }

    /**
     * sends direction to redirect the user into favorite pet page
     */
    @Override
    public void execute() {
        presenter.prepareSuccessView();
    }
}

package Entity.PetProfiles;


public interface ProfileBuilderFactory {
    /*Must be valid system registered*/
    DogProfileBuilder createDogProfile(String petOwnerName);
}
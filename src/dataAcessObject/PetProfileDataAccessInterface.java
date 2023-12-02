package dataAcessObject;

import entity.petProfile.PetProfile;

public interface PetProfileDataAccessInterface {
    void add(PetProfile profile);
    void update(PetProfile profile);
    PetProfile getProfile(int id);
    void delete(int id);
    boolean exists(int id);
}
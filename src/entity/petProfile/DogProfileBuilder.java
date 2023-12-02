package entity.petProfile;

public class DogProfileBuilder extends PetProfileBuilder<DogProfileBuilder,DogProfile>{
    boolean neuter;
    boolean vaccinated;
    String breed;
    @Override
    public DogProfile build() {
        return new DogProfile(this);
    }
    public DogProfileBuilder(String petOwnerName){
        super(petOwnerName);
        this.specie = DogProfile.specieName;
    }


    public DogProfileBuilder withBreed(String breed){
        this.breed = breed;
        return this;
    }
    public DogProfileBuilder vaccinated(boolean vaccinated){
        this.vaccinated = vaccinated;
        return this;
    }
    public DogProfileBuilder neutered(boolean neuter){
        this.neuter = neuter;
        return this;
    }
}

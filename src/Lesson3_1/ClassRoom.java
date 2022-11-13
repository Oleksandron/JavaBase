package Lesson3_1;

public class ClassRoom {
    public Pupil anna, maks, piter, lena;
    public ClassRoom(Pupil anna, Pupil maks, Pupil piter, Pupil lena){
        this.anna = anna;
        this.maks = maks;
        this.piter = piter;
        this.lena = lena;
    }
    public ClassRoom(Pupil anna, Pupil maks, Pupil piter){
        this.anna = anna;
        this.maks = maks;
        this.piter = piter;
    }

    public ClassRoom(Pupil anna, Pupil maks){
        this.anna = anna;
        this.maks = maks;
    }

}


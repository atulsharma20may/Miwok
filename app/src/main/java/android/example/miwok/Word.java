package android.example.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceID = NO_IMAGE_PROVIDED;


    public Word(String miwokTranslation, String defaultTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourdeID) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceID = imageResourdeID;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}

package android.example.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private int mAudioResourceID;

    public Word(String miwokTranslation, String defaultTranslation, int audioResourceID) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceID = audioResourceID;
    }

    public Word(String miwokTranslation, String defaultTranslation, int audioResourceID, int imageResourdeID) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceID = audioResourceID;
        mImageResourceID = imageResourdeID;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getAudioResourceID() {
        return mAudioResourceID;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}

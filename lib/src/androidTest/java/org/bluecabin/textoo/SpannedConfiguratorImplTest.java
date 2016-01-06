package org.bluecabin.textoo;

import android.text.SpannableString;
import android.text.Spanned;

/**
 * Created by fergus on 1/5/16.
 */
public class SpannedConfiguratorImplTest extends LinkifyTest<SpannedConfigurator> {

    @Override
    protected SpannedConfigurator createConfigurator(String text) {
        return SpannedConfiguratorImpl.create(ConfiguratorFactory.getInstance(), new SpannableString(text));
    }

    @Override
    protected Spanned toSpanned(Object result) {
        return (Spanned) result;
    }
}
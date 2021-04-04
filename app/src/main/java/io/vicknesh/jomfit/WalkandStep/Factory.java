
package io.vicknesh.jomfit.WalkandStep;

import android.content.pm.PackageManager;

import io.vicknesh.jomfit.WalkandStep.services.AbstractStepDetectorService;
import io.vicknesh.jomfit.WalkandStep.services.AccelerometerStepDetectorService;
import io.vicknesh.jomfit.WalkandStep.services.HardwareStepDetectorService;
import io.vicknesh.jomfit.WalkandStep.utils.AndroidVersionHelper;




public class Factory {



    public static Class<? extends AbstractStepDetectorService> getStepDetectorServiceClass(PackageManager pm){
        if(pm != null && AndroidVersionHelper.supportsStepDetector(pm)) {
            return HardwareStepDetectorService.class;
        }else{
            return AccelerometerStepDetectorService.class;
        }
    }
}

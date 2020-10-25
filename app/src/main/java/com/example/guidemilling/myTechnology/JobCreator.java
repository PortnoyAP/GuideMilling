package com.example.guidemilling.myTechnology;


import com.example.guidemilling.myTechnology.materials.CastIron_K1;
import com.example.guidemilling.myTechnology.materials.CastIron_K2;
import com.example.guidemilling.myTechnology.materials.CastIron_K3;
import com.example.guidemilling.myTechnology.materials.HIghTempAlloysS1;
import com.example.guidemilling.myTechnology.materials.HIghTempAlloysS2;
import com.example.guidemilling.myTechnology.materials.HIghTempAlloysS3;
import com.example.guidemilling.myTechnology.materials.HIghTempAlloysS4;
import com.example.guidemilling.myTechnology.materials.HardenedMaterialsH1;
import com.example.guidemilling.myTechnology.materials.HardenedMaterialsH2;
import com.example.guidemilling.myTechnology.materials.Material;
import com.example.guidemilling.myTechnology.materials.NonFerrousMaterialsN1;
import com.example.guidemilling.myTechnology.materials.NonFerrousMaterialsN2;
import com.example.guidemilling.myTechnology.materials.NonFerrousMaterialsN3;
import com.example.guidemilling.myTechnology.materials.NonFerrousMaterialsN4;
import com.example.guidemilling.myTechnology.materials.NonFerrousMaterialsN5;
import com.example.guidemilling.myTechnology.materials.NonFerrousMaterialsN6;
import com.example.guidemilling.myTechnology.materials.StainlessSteel_M1;
import com.example.guidemilling.myTechnology.materials.StainlessSteel_M2;
import com.example.guidemilling.myTechnology.materials.StainlessSteel_M3;
import com.example.guidemilling.myTechnology.materials.Steel_P1;
import com.example.guidemilling.myTechnology.materials.Steel_P2;
import com.example.guidemilling.myTechnology.materials.Steel_P3;
import com.example.guidemilling.myTechnology.materials.Steel_P4;
import com.example.guidemilling.myTechnology.materials.Steel_P5;
import com.example.guidemilling.myTechnology.materials.Steel_P6;
import com.example.guidemilling.myTechnology.tools.Drill;
import com.example.guidemilling.myTechnology.tools.FaceMill;
import com.example.guidemilling.myTechnology.tools.Graver;
import com.example.guidemilling.myTechnology.tools.Mill;
import com.example.guidemilling.myTechnology.tools.Tool;

public class JobCreator {

    private Material material;
    private String operation;
    private Tool tool;


    public JobCreator() {
    }


    public JobCreator(String fullNameMaterialFromUser, String operation, int toolDiameter) {   // constructor cheCkd the var type for creating correct materialObject

        this.operation = operation;

        switch (fullNameMaterialFromUser) {
            case "P1 Low-Carbon Steels":
                material = new Steel_P1();
                break;

            case "P2 Medium/High Carbon Steels":
                material = new Steel_P2();
                break;

            case "P3 Alloy/Tool Steel":
                material = new Steel_P3();
                break;

            case "P4 Alloy/Tool Steel":
                material = new Steel_P4();
                break;

            case "P5 Ferritic/Martensitic/PH Stainless Steels":
                material = new Steel_P5();
                break;

            case "P6 High-Strength Ferritic":
                material = new Steel_P6();
                break;

            case "N1 Wrought Aluminium":
                material = new NonFerrousMaterialsN1();
                break;

            case "N2 Low-Silicon Aluminium Alloys/Magnesium Alloys":
                material = new NonFerrousMaterialsN2();
                break;

            case "N3 High-Silicon Aluminium Alloys/Magnesium Alloys":
                material = new NonFerrousMaterialsN3();
                break;

            case "N4 Copper/Brass/Zinc":
                material = new NonFerrousMaterialsN4();
                break;

            case "N5 Nylon/Plastics/Rubbers/Phenolics/Resins/Fibreglass":
                material = new NonFerrousMaterialsN5();
                break;

            case "N6 Carbon/Graphite Composites/CFRP":
                material = new NonFerrousMaterialsN6();
                break;

            case "K1 Grey Cast Iron":
                material = new CastIron_K1();
                break;

            case "K2 Low/Medium-Strength Ductile Irons/CGI":
                material = new CastIron_K2();
                break;

            case "K3 High-Strength Ductile Irons/ADI":
                material = new CastIron_K3();
                break;

            case "M1 Austenitic Stainless Steel":
                material = new StainlessSteel_M1();
                break;

            case "M2 High-Strength/Cast Stainless Steels":
                material = new StainlessSteel_M2();
                break;

            case "M3 Duplex Stainless Steel":
                material = new StainlessSteel_M3();
                break;

            case "S1 Iron-Based/Heat-Resistant Alloys":
                material = new HIghTempAlloysS1();
                break;

            case "S2 Cobalt-Based/Heat-Resistant Alloys":
                material = new HIghTempAlloysS2();
                break;
            case "S3 Nickel-Based/Heat-Resistant Alloys":
                material = new HIghTempAlloysS3();
                break;

            case "S4 Titanium/Titanium Alloys":
                material = new HIghTempAlloysS4();

                break;

            case "H1 Hardened Materials":
                material = new HardenedMaterialsH1();
                break;

            case "H2 Hardened Materials":
                material = new HardenedMaterialsH2();
                break;

            default:
                break;

        }    // material init
        switch (operation) {
            case "Side Milling":
            case "Slot Milling":
            case "Milling":
                tool = new Mill();
                tool.setDiameter(toolDiameter);
                break;

            case "Z Milling":
                tool = new FaceMill();
                tool.setDiameter(toolDiameter);
                break;

            case "Drill":
            case "Drilling":
                tool = new Drill();
                tool.setDiameter(toolDiameter);
                break;

            case "Writing Text":
                tool = new Graver();
                break;

            default:
                break;

        }



    }


    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;

    }

    public String getOperation() {
        return operation;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
}

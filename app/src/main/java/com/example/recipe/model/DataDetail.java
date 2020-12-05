package com.example.recipe.model;

public class DataDetail {
    String menu, preparation, cooking, material_1, material_2, material_3, step_1, step_2, step_3;

    public DataDetail(){}

    public DataDetail(String menu, String preparation, String cooking, String material_1, String material_2, String material_3, String step_1, String step_2, String step_3) {
        this.menu = menu;
        this.preparation = preparation;
        this.cooking = cooking;
        this.material_1 = material_1;
        this.material_2 = material_2;
        this.material_3 = material_3;
        this.step_1 = step_1;
        this.step_2 = step_2;
        this.step_3 = step_3;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public String getCooking() {
        return cooking;
    }

    public void setCooking(String cooking) {
        this.cooking = cooking;
    }

    public String getMaterial_1() {
        return material_1;
    }

    public void setMaterial_1(String material_1) {
        this.material_1 = material_1;
    }

    public String getMaterial_2() {
        return material_2;
    }

    public void setMaterial_2(String material_2) {
        this.material_2 = material_2;
    }

    public String getMaterial_3() {
        return material_3;
    }

    public void setMaterial_3(String material_3) {
        this.material_3 = material_3;
    }

    public String getStep_1() {
        return step_1;
    }

    public void setStep_1(String step_1) {
        this.step_1 = step_1;
    }

    public String getStep_2() {
        return step_2;
    }

    public void setStep_2(String step_2) {
        this.step_2 = step_2;
    }

    public String getStep_3() {
        return step_3;
    }

    public void setStep_3(String step_3) {
        this.step_3 = step_3;
    }
}

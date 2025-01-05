package com.example.OptimalYou.model.ai;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDietPreferences {

    // Personal Information
    private String name;
    private int age;
    private String gender;

    // Health and Dietary Conditions
    private List<String> healthConditions;
    private List<String> allergies;
    private List<String> dietaryRestrictions; // e.g., vegan, vegetarian, gluten-free, etc.

    // Calorie and Nutrient Goals
    private int dailyCalorieGoal; // in kcal
    private List<String> macronutrientRatio; // e.g., "40% Carbs, 30% Protein, 30% Fat"

    // Meal Preferences
    private List<String> preferredCuisines; // e.g., Italian, Asian, Mediterranean
    private List<String> preferredIngredients; // e.g., chicken, rice, quinoa
    private List<String> avoidedIngredients; // e.g., peanuts, dairy

    // Meal Frequency
    private int mealsPerDay; // e.g., 3 meals + 2 snacks
    private List<String> preferredMealTimes; // e.g., breakfast, lunch, dinner, snack

    // Grocery List and Available Ingredients
    private List<String> groceryList; // List of grocery items the user wants to buy

    // Special Requirements
    private boolean includesRecipes; // Whether to include specific recipes for meals
    private boolean includesShoppingList; // Whether to generate a shopping list

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }

    public List<String> getAvoidedIngredients() {
        return avoidedIngredients;
    }

    public void setAvoidedIngredients(List<String> avoidedIngredients) {
        this.avoidedIngredients = avoidedIngredients;
    }

    public int getDailyCalorieGoal() {
        return dailyCalorieGoal;
    }

    public void setDailyCalorieGoal(int dailyCalorieGoal) {
        this.dailyCalorieGoal = dailyCalorieGoal;
    }

    public List<String> getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    public void setDietaryRestrictions(List<String> dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(List<String> groceryList) {
        this.groceryList = groceryList;
    }

    public List<String> getHealthConditions() {
        return healthConditions;
    }

    public void setHealthConditions(List<String> healthConditions) {
        this.healthConditions = healthConditions;
    }

    public boolean isIncludesRecipes() {
        return includesRecipes;
    }

    public void setIncludesRecipes(boolean includesRecipes) {
        this.includesRecipes = includesRecipes;
    }

    public boolean isIncludesShoppingList() {
        return includesShoppingList;
    }

    public void setIncludesShoppingList(boolean includesShoppingList) {
        this.includesShoppingList = includesShoppingList;
    }

    public List<String> getMacronutrientRatio() {
        return macronutrientRatio;
    }

    public void setMacronutrientRatio(List<String> macronutrientRatio) {
        this.macronutrientRatio = macronutrientRatio;
    }

    public int getMealsPerDay() {
        return mealsPerDay;
    }

    public void setMealsPerDay(int mealsPerDay) {
        this.mealsPerDay = mealsPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPreferredCuisines() {
        return preferredCuisines;
    }

    public void setPreferredCuisines(List<String> preferredCuisines) {
        this.preferredCuisines = preferredCuisines;
    }

    public List<String> getPreferredIngredients() {
        return preferredIngredients;
    }

    public void setPreferredIngredients(List<String> preferredIngredients) {
        this.preferredIngredients = preferredIngredients;
    }

    public List<String> getPreferredMealTimes() {
        return preferredMealTimes;
    }

    public void setPreferredMealTimes(List<String> preferredMealTimes) {
        this.preferredMealTimes = preferredMealTimes;
    }

    @Override
    public String toString() {
        return "UserDietPreferences{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", healthConditions=" + healthConditions +
                ", allergies=" + allergies +
                ", dietaryRestrictions=" + dietaryRestrictions +
                ", dailyCalorieGoal=" + dailyCalorieGoal +
                ", macronutrientRatio=" + macronutrientRatio +
                ", preferredCuisines=" + preferredCuisines +
                ", preferredIngredients=" + preferredIngredients +
                ", avoidedIngredients=" + avoidedIngredients +
                ", mealsPerDay=" + mealsPerDay +
                ", preferredMealTimes=" + preferredMealTimes +
                ", groceryList=" + groceryList +
                ", includesRecipes=" + includesRecipes +
                ", includesShoppingList=" + includesShoppingList +
                '}';
    }
}



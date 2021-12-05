from django.urls import path
from .import views

urlpatterns =[
    path('meals/', views.getMeals),
    path('meals/<str:pk>', views.getMeal),
    path('meals/delete/<str:pk>', views.deleteMeal),
    path('meals/update/', views.updateMeal),
    path('meals/add/', views.addMeal),
    path('meals/summCalories/<str:date>', views.getSumCalories),

]
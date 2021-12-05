from django.urls import path
from . import views

urlpatterns = [
    path("", views.showIndex, name='home'),
    path("meals/", views.listAll, name='meals'),
    path("meals/addMeal/", views.addMeal, name='addMeal'),
    path("meals/update", views.updateMeal, name='updateMeal')

]

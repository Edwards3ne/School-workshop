from django.shortcuts import render, redirect
from .models import MealClass
from .forms import MealForm

# Create your views here.
def showIndex(request):

    if request.GET.get('mealId')is not None:
        getMeal=MealClass.objects.get(id=request.GET.get('mealId'))
        return render(request,"index.html",{"getMeal":getMeal})

    return render(request,"index.html")


def listAll(request):
    meals_set = MealClass.objects.all()
    return render(request,"index.html",{"meals":list(meals_set)})

def addMeal(request):
    form=MealForm()
    if request.method =='POST':
        form=MealForm(request.POST)
        if form.is_valid():
            form.save()
            return redirect('/')

    return render(request,"addMeal.html",{'form':form})

def updateMeal(request):
    id=request.PUT.get('id')
    updatedMeal=MealClass.objects.get(id)
    updatedMeal.name=request.PUT.get('name')
    updatedMeal.date=request.PUT.get('date')
    updatedMeal.calories=request.PUT.get('calories')
    updatedMeal.save()



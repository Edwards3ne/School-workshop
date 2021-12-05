from rest_framework.decorators import api_view
from rest_framework.response import Response
from django.http import JsonResponse
from meals.models import MealClass
from .serializers import MealSerializer
from meals.forms import MealFullForm


@api_view(['POST'])
def addMeal(request):
    new = MealClass()
    new.id = request.data.get('id')
    new.name = request.data.get('name')
    new.calories = request.data.get('calories')
    new.date = request.data.get('date')
    new.save()
    message = ['Object was created successfully']
    return JsonResponse(message, safe=False)


@api_view(['GET'])
def getMeals(request):
    meals = MealClass.objects.all()
    serializer = MealSerializer(meals, many=True)
    return Response(serializer.data)


@api_view(['PUT'])
def updateMeal(request):
    id = request.data.get('id')
    updatedMeal = MealClass.objects.get(id=id)
    print(updatedMeal)
    if updatedMeal is not None:
        updatedMeal.name = request.data.get('name')
        updatedMeal.date = request.data.get('date')
        updatedMeal.calories = request.data.get('calories')
        updatedMeal.save()
        message = ['Object was updated']
    else:
        message = ['object not found']
    return JsonResponse(message, safe=False)


@api_view(['DELETE'])
def deleteMeal(request, pk):
    if MealClass.objects.get(id=pk) is not None:
        MealClass.objects.get(id=pk).delete()
        message = ['Object was deleted']
    else:
        message = ['object not found']

    return JsonResponse(message, safe=False)


@api_view(['GET'])
def getMeal(request, pk):
    meal = MealClass.objects.get(id=pk)
    serializer = MealSerializer(meal, many=False)
    return Response(serializer.data)


@api_view(['GET'])
def getSumCalories(request, date):
    meals = MealClass.objects.all()
    sumCalories = 0
    for meal in meals:

        if str(meal.date) == str(date):
            sumCalories = sumCalories + meal.calories

    message = ['summ of calories', sumCalories]
    return JsonResponse(message, safe=False)

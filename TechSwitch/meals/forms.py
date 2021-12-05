from django.forms import ModelForm
from .models import MealClass

class MealForm(ModelForm):
    class Meta:
        model=MealClass
        fields=['name','calories','date']

class MealFullForm(ModelForm):
    class Meta:
        model=MealClass
        fields=['id','name','calories','date']
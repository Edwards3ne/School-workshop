from rest_framework.serializers import ModelSerializer
from meals.models import MealClass


class MealSerializer(ModelSerializer):
    class Meta:
        model = MealClass
        fields = '__all__'

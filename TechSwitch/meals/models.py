from django.db import models

# Create your models here.
class MealClass(models.Model):
    name=models.CharField(max_length=255)
    calories=models.PositiveIntegerField()
    date=models.DateTimeField()



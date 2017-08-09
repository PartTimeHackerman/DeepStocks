import Solver as Solver
import genArr
import pandas as pd
from auto_ml import Predictor
from auto_ml.utils import get_boston_dataset
from auto_ml.utils_models import load_ml_model
from sklearn.datasets import load_boston

# Load data
s = Solver()
g = genArr.genArr()
df_train, df_test = get_boston_dataset()

first = [5., 3., 0., 2., 7.]
second = [4.4, 7.9, 4.4, 6.9, 10]
third = [2.19, 14.04, 3.125, 10.816, 10.185]

data = pd.DataFrame()
data['IN'] = first
data['OUT'] = second

data_test = pd.DataFrame()
data_test['IN'] = second
# Tell auto_ml which column is 'output'
# Also note columns that aren't purely numerical
# Examples include ['nlp', 'date', 'categorical', 'ignore']
column_descriptions = {
    'OUT': 'output'
}
boston = load_boston()
ml_predictor = Predictor(type_of_estimator='regressor', column_descriptions=column_descriptions)

print('Training:\n')
ml_predictor.train(data, ml_for_analytics=True, model_names=['DeepLearningRegressor'])

# Score the model on test data
print('Score the model on test data:\n')
test_score = ml_predictor.score(data, data.OUT)

# auto_ml is specifically tuned for running in production
# It can get predictions on an individual row (passed in as a dictionary)
# A single prediction like this takes ~1 millisecond
# Here we will demonstrate saving the trained model, and loading it again
file_name = ml_predictor.save()

trained_model = load_ml_model(file_name)

# .predict and .predict_proba take in either:
# A pandas DataFrame
# A list of dictionaries
# A single dictionary (optimized for speed in production evironments)
print('Predictions:\n')

predictions = trained_model.predict(data)
predictions = trained_model.predict(data_test)
print(predictions)
print(data_test.IN)

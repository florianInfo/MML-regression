import pandas as pd
from sklearn.ensemble import RandomForestClassifier
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_squared_error


mml_data = pd.read_csv('foo.csv', sep=',')
col_names=mml_data.columns
X= mml_data.drop(columns=[col_names[len(col_names)-1]])
Y= mml_data[col_names[len(col_names)-1]]
algo=RandomForestClassifier()
X_train, X_test, Y_train, Y_test = train_test_split(X, Y, test_size=0.09999999999999998)
algo.fit(X_train, Y_train)
mse = mean_squared_error(Y_test, algo.predict(X_test))
print('Mean squared error : '+str(mse))

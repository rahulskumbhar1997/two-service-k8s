from flask import Flask


app = Flask(__name__)


@app.route("/")
def home_route():

    return {"message": "This is Home"}

if __name__ == "__main__":
    
    app.run('0.0.0.0', port=8090)
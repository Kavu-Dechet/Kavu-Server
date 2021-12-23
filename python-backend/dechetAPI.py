from flask import Flask, jsonify, request
import persistence

app = Flask(__name__)

@app.route('/dechet/', methods=['POST'])
def create_user():
    # On recupere le corps (payload) de la requete
    payload = request.form.to_dict()
    result = persistence.insert_dechet(**payload)

    if result:
        return jsonify(status='True', message='User created')
    return jsonify(status='False')

if __name__ == '__main__':
    print("Hello from API")
    app.run(host='0.0.0.0', port=5000, debug=True)

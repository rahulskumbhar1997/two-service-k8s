FROM redhat/ubi9-minimal

RUN microdnf install -y python3 python3-pip

WORKDIR /opt

COPY . .

RUN pip3 install -r requirements.txt

CMD ["python3", "app.py"]
FROM maven:3.9.15-eclipse-temurin-21

# Install dependencies

RUN apt-get update && apt-get install -y 
wget 
gnupg 
unzip 
curl

# Add Microsoft Edge repository

RUN curl https://packages.microsoft.com/keys/microsoft.asc | gpg --dearmor > microsoft.gpg && 
install -o root -g root -m 644 microsoft.gpg /usr/share/keyrings/microsoft.gpg

RUN echo "deb [arch=amd64 signed-by=/usr/share/keyrings/microsoft.gpg] https://packages.microsoft.com/repos/edge stable main" 
> /etc/apt/sources.list.d/microsoft-edge.list

# Install Microsoft Edge

RUN apt-get update && apt-get install -y microsoft-edge-stable

WORKDIR /app

COPY . .

RUN mvn clean install -DskipTests

CMD ["mvn","-Dtest=runner.TestRunner","test"]

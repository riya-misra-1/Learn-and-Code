const readline = require("readline");

enum source {
  Gmail = "Gmail",
  Outlook = "Outlook",
  Yahoo = "Yahoo",
}

type entityType = "email" | "server";

interface emailEntity {
  entityType: entityType;
  email: string;
  source: source[];
}

function getCarbonFootprint(entity: emailEntity) {
  const readLine = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
  });

  readLine.question("Total emails in inbox: ", function (inboxEmail) {
    const numberOfInboxEmails = parseInt(inboxEmail);

    readLine.question("Total emails in spam: ", function (spamEmail) {
      const numberOfSpamEmails = parseInt(spamEmail);

      readLine.question("Total emails sent: ", function (sentEmail) {
        const numberOfSentEmails = parseInt(sentEmail);

        let totalCarbonFootprint = 0;

        if (entity.entityType === "email") {
          totalCarbonFootprint += numberOfInboxEmails * 4 + numberOfSentEmails * 4 + numberOfSpamEmails * 0.3;
        }

        console.log(`${entity.entityType} (entityType basis)`);
        console.log(`emailId: ${entity.email}`);
        console.log(`source: ${entity.source.join("/")}`);
        console.log(`inbox: ${(numberOfInboxEmails * 4)/1000} KG`);
        console.log(`sent: ${(numberOfSentEmails * 27)/1000} KG`);
        console.log(`spam: ${(numberOfSpamEmails * 0.3)/1000} KG`);
        console.log(`Total Carbon Footprint: ${totalCarbonFootprint} g CO2e`);

      });
    });
  });
}

const emailEntity: emailEntity = {
  entityType: "email",
  email: "abc@xyz.com",
  source: [source.Gmail, source.Outlook, source.Yahoo],
};

getCarbonFootprint(emailEntity);

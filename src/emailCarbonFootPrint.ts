const readline = require("readline");
import { EmailEntity } from "./common/interface";

class CarbonFootprintCalculator {
  private numberOfInboxEmails: number;
  private numberOfSpamEmails: number;
  private numberOfSentEmails: number;

  public readInput(entity: EmailEntity) {
    const readLine = readline.createInterface({
      input: process.stdin,
      output: process.stdout,
    });

    readLine.question("Total emails in inbox: ", (inboxEmail) => {
      this.numberOfInboxEmails = parseInt(inboxEmail);
      readLine.question("Total emails in spam: ", (spamEmail) => {
        this.numberOfSpamEmails = parseInt(spamEmail);
        readLine.question("Total emails sent: ", (sentEmail) => {
          this.numberOfSentEmails = parseInt(sentEmail);
          this.calculateAndPrintCarbonFootprint(entity);
        });
      });
    });
  }

  private calculateTotalCarbonFootprint(entity: EmailEntity): number {
    let totalCarbonFootprint = 0;

    if (entity.entityType === "email") {
      totalCarbonFootprint =
        this.numberOfInboxEmails * 4 +
        this.numberOfSentEmails * 27 +
        this.numberOfSpamEmails * 0.3;
    }

    return totalCarbonFootprint;
  }

  private printResponse(entity: EmailEntity, totalCarbonFootprint: number) {
    const result = {
      entityType: entity.entityType,
      email: entity.email,
      source: entity.source.join("/"),
      inbox: (this.numberOfInboxEmails * 4) / 1000,
      sent: (this.numberOfSentEmails * 27) / 1000,
      spam: (this.numberOfSpamEmails * 0.3) / 1000,
      totalCarbonFootprint: totalCarbonFootprint,
    };

    console.log(result);
  }

  private calculateAndPrintCarbonFootprint(entity: EmailEntity) {
    const totalCarbonFootprint = this.calculateTotalCarbonFootprint(entity);
    this.printResponse(entity, totalCarbonFootprint);
  }
}

export default CarbonFootprintCalculator;



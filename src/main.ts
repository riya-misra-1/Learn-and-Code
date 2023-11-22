import { EmailEntity } from "./common/interface";
import Source from "./common/enum";
import CarbonFootprintCalculator from "./emailCarbonFootPrint";

const emailEntity: EmailEntity = 
{
  entityType: "email",
  email: "abc@xyz.com",
  source: [Source.Gmail, Source.Outlook, Source.Yahoo],
};

const calculator = new CarbonFootprintCalculator();
calculator.readEmailInput(emailEntity);

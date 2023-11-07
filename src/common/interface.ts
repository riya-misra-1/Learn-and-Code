import Source from "./enum";
export type EntityType = "email" | "server";

export interface EmailEntity 
{
  entityType: EntityType;
  email: string;
  source: Source[];
}

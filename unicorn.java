// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class unicorn extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer rightear_r1_r1;
	private final ModelRenderer neck;
	private final ModelRenderer neck_r1;
	private final ModelRenderer tail;
	private final ModelRenderer tail_r1;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer leftbackleg;
	private final ModelRenderer fetlock_r1_r1;
	private final ModelRenderer backrightleg;
	private final ModelRenderer fetlock_r2_r1;
	private final ModelRenderer frontleftleg;
	private final ModelRenderer frontleftleg_r1;
	private final ModelRenderer frontrightleg;
	private final ModelRenderer frontrightleg_r1;

	public unicorn() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.9F, 9.2F, -9.1F);
		

		rightear_r1_r1 = new ModelRenderer(this);
		rightear_r1_r1.setRotationPoint(-6.0167F, 4.0836F, 15.2259F);
		head.addChild(rightear_r1_r1);
		setRotationAngle(rightear_r1_r1, 0.0F, -1.5708F, 0.0F);
		rightear_r1_r1.setTextureOffset(36, 51).addBox(-14.0833F, -19.377F, -11.7272F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		rightear_r1_r1.setTextureOffset(30, 51).addBox(-14.0833F, -19.2836F, -3.1259F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		rightear_r1_r1.setTextureOffset(0, 18).addBox(-18.0833F, -17.2836F, -11.1259F, 7.0F, 8.0F, 9.0F, 0.0F, false);
		rightear_r1_r1.setTextureOffset(20, 35).addBox(-16.0833F, -21.2836F, -7.1259F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		rightear_r1_r1.setTextureOffset(23, 18).addBox(-21.0833F, -12.2836F, -9.1259F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.9F, 14.8F, 9.1F);
		head.addChild(neck);
		

		neck_r1 = new ModelRenderer(this);
		neck_r1.setRotationPoint(-6.9167F, -10.7164F, 6.1259F);
		neck.addChild(neck_r1);
		setRotationAngle(neck_r1, 0.0F, -1.5708F, 0.0F);
		neck_r1.setTextureOffset(46, 18).addBox(-15.0833F, -11.2836F, -9.1259F, 4.0F, 6.0F, 5.0F, 0.0F, false);
		neck_r1.setTextureOffset(25, 28).addBox(-13.0833F, -16.2836F, -10.1259F, 7.0F, 11.0F, 7.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		tail_r1 = new ModelRenderer(this);
		tail_r1.setRotationPoint(-6.9167F, -10.7164F, 6.1259F);
		tail.addChild(tail_r1);
		setRotationAngle(tail_r1, 0.0F, -1.5708F, 0.0F);
		tail_r1.setTextureOffset(0, 35).addBox(1.9167F, -5.2836F, -10.1259F, 5.0F, 14.0F, 5.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(-6.9167F, -10.7164F, 6.1259F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.0F, -1.5708F, 0.0F);
		body_r1.setTextureOffset(0, 0).addBox(-15.0833F, -5.2836F, -12.1259F, 18.0F, 8.0F, 10.0F, 0.0F, false);

		leftbackleg = new ModelRenderer(this);
		leftbackleg.setRotationPoint(-1.125F, 13.625F, 13.5F);
		

		fetlock_r1_r1 = new ModelRenderer(this);
		fetlock_r1_r1.setRotationPoint(-5.7917F, -0.3414F, -7.3741F);
		leftbackleg.addChild(fetlock_r1_r1);
		setRotationAngle(fetlock_r1_r1, 0.0F, -1.5708F, 0.0F);
		fetlock_r1_r1.setTextureOffset(50, 46).addBox(1.9167F, 2.7164F, -13.1259F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		fetlock_r1_r1.setTextureOffset(44, 46).addBox(1.9167F, 4.7164F, -13.1259F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		fetlock_r1_r1.setTextureOffset(46, 32).addBox(0.7917F, 9.3414F, -13.6259F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		fetlock_r1_r1.setTextureOffset(34, 18).addBox(-1.0833F, 1.7164F, -13.1259F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		fetlock_r1_r1.setTextureOffset(20, 46).addBox(-2.0833F, -3.2836F, -13.1259F, 5.0F, 5.0F, 1.0F, 0.0F, false);

		backrightleg = new ModelRenderer(this);
		backrightleg.setRotationPoint(-12.125F, 12.625F, 13.5F);
		

		fetlock_r2_r1 = new ModelRenderer(this);
		fetlock_r2_r1.setRotationPoint(5.2083F, 0.6586F, -7.3741F);
		backrightleg.addChild(fetlock_r2_r1);
		setRotationAngle(fetlock_r2_r1, 0.0F, -1.5708F, 0.0F);
		fetlock_r2_r1.setTextureOffset(38, 46).addBox(1.9167F, 2.7164F, -2.1259F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		fetlock_r2_r1.setTextureOffset(32, 46).addBox(1.9167F, 4.7164F, -2.1259F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		fetlock_r2_r1.setTextureOffset(46, 29).addBox(0.7917F, 9.3414F, -2.6259F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		fetlock_r2_r1.setTextureOffset(0, 6).addBox(-1.0833F, 1.7164F, -2.1259F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		fetlock_r2_r1.setTextureOffset(46, 0).addBox(-2.0833F, -3.2836F, -2.1259F, 5.0F, 5.0F, 1.0F, 0.0F, false);

		frontleftleg = new ModelRenderer(this);
		frontleftleg.setRotationPoint(-2.0F, 14.0F, 1.0F);
		

		frontleftleg_r1 = new ModelRenderer(this);
		frontleftleg_r1.setRotationPoint(-4.9167F, -0.7164F, 5.1259F);
		frontleftleg.addChild(frontleftleg_r1);
		setRotationAngle(frontleftleg_r1, 0.0F, -1.5708F, 0.0F);
		frontleftleg_r1.setTextureOffset(46, 6).addBox(-14.5833F, 9.7164F, -13.6259F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		frontleftleg_r1.setTextureOffset(0, 35).addBox(-14.0833F, 6.7164F, -13.1259F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		frontleftleg_r1.setTextureOffset(45, 18).addBox(-14.0833F, 2.7164F, -13.1259F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		frontleftleg_r1.setTextureOffset(0, 18).addBox(-14.0833F, -1.2836F, -13.1259F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		frontrightleg = new ModelRenderer(this);
		frontrightleg.setRotationPoint(-12.0F, 14.0F, 1.0F);
		

		frontrightleg_r1 = new ModelRenderer(this);
		frontrightleg_r1.setRotationPoint(5.0833F, -0.7164F, 5.1259F);
		frontrightleg.addChild(frontrightleg_r1);
		setRotationAngle(frontrightleg_r1, 0.0F, -1.5708F, 0.0F);
		frontrightleg_r1.setTextureOffset(0, 24).addBox(-14.5833F, 9.7164F, -2.6259F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		frontrightleg_r1.setTextureOffset(23, 18).addBox(-14.0833F, 6.7164F, -2.1259F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		frontrightleg_r1.setTextureOffset(39, 21).addBox(-14.0833F, 2.7164F, -2.1259F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		frontrightleg_r1.setTextureOffset(0, 0).addBox(-14.0833F, -1.2836F, -2.1259F, 3.0F, 5.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftbackleg.render(matrixStack, buffer, packedLight, packedOverlay);
		backrightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		frontleftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		frontrightleg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
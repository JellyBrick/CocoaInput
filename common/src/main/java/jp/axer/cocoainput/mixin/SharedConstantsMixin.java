package jp.axer.cocoainput.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import net.minecraft.SharedConstants;

@Mixin(SharedConstants.class)
public final class SharedConstantsMixin {

    //@ModifyConstant(method="isAllowedChatCharacter",constant=@Constant(intValue=167))
    //@Inject(at=@At("HEAD"),method="isAllowedChatCharacter")
    @Overwrite
    public static boolean isAllowedChatCharacter(char p) {
        return p >= ' ' && p != 127;
    }
}

SECTION = "devel/chicken"
DESCRIPTION = "Bindings to the ISAAC CSPRNG"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://isaac.meta;md5=de98043a07249c8f46c5a31920d66603"
DEPENDS_append_class-cross = " chicken-egg-module-declarations-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-module-declarations-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-module-declarations chicken-egg-module-declarations-crosssdk"
DEPENDS = " chicken-egg-module-declarations chicken-egg-module-declarations-cross"
RDEPENDS_${PN} = " chicken-egg-module-declarations"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/isaac/isaac-${PV}.tar.gz"

SRC_URI[md5sum] = "6e8982ba4723377c8ae7530f7b91891c"
SRC_URI[sha256sum] = "6cc2fcd9f221ffcdd6d9c6e81fa6c6f01dad63862c5251a3fcac2df4f4624335"

S = "${WORKDIR}/isaac-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

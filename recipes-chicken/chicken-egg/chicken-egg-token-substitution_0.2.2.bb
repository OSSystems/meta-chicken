SECTION = "devel/chicken"
DESCRIPTION = "Token substitution"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://token-substitution.meta;md5=3ae0f65185f8ac759bbc1406dce24471"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-vector-lib-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-vector-lib-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-vector-lib chicken-egg-setup-helper-crosssdk chicken-egg-vector-lib-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-vector-lib chicken-egg-setup-helper-cross chicken-egg-vector-lib-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-vector-lib"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/token-substitution/token-substitution-${PV}.tar.gz"

SRC_URI[md5sum] = "11d531123a24c5fcb13d7eb9dec8aab6"
SRC_URI[sha256sum] = "c44c2a4f68eed113ad0c32fed1951f727238ff3ebb82e58cb5319fd3116f4a0f"

S = "${WORKDIR}/token-substitution-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

SECTION = "devel/chicken"
DESCRIPTION = "Convenience procedure for changing directories"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://with-current-directory.meta;md5=61dc239229dc2276c2e0ab59db23287f"
DEPENDS_append_class-cross = " chicken-egg-module-declarations-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-module-declarations-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-module-declarations chicken-egg-module-declarations-crosssdk"
DEPENDS = " chicken-egg-module-declarations chicken-egg-module-declarations-cross"
RDEPENDS_${PN} = " chicken-egg-module-declarations"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/with-current-directory/with-current-directory-${PV}.tar.gz"

SRC_URI[md5sum] = "0de406b58e2f61d07c42ce124e6e2a73"
SRC_URI[sha256sum] = "4483c65ce09c8598f043f9f3f5f0f48ddb736cd18c657732af2af3af09599068"

S = "${WORKDIR}/with-current-directory-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

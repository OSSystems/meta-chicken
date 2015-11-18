SECTION = "devel/chicken"
DESCRIPTION = "Handle command-line options as parameters"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://easy-args.meta;md5=b67f09076c8c2c14363adf0dbaf1667a"
DEPENDS_append_class-cross = " chicken-egg-srfi-37-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-srfi-37-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-srfi-37 chicken-egg-srfi-37-crosssdk"
DEPENDS = " chicken-egg-srfi-37 chicken-egg-srfi-37-cross"
RDEPENDS_${PN} = " chicken-egg-srfi-37"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/easy-args/easy-args-${PV}.tar.gz"

SRC_URI[md5sum] = "18df20c49908f77284783489163dd4af"
SRC_URI[sha256sum] = "b24b4212643f84eb059c0082a872b50df69ffaf30859fcf5c507908d40d6404f"

S = "${WORKDIR}/easy-args-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

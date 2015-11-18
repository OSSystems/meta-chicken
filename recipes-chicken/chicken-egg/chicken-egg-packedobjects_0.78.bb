SECTION = "devel/chicken"
DESCRIPTION = "cross platform bit-stuffing based on Packed Encoding Rules"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://packedobjects.meta;md5=45ae809b07403673aca028aae464f249"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/packedobjects/packedobjects-${PV}.tar.gz"

SRC_URI[md5sum] = "e82206219b7ba8c4f138e5b55be73adf"
SRC_URI[sha256sum] = "e732e4226d230124c82d0279a3bc4e234b14f9aedfaf3782cd2eae8a47ec5526"

S = "${WORKDIR}/packedobjects-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

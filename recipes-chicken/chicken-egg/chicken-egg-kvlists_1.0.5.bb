SECTION = "devel/chicken"
DESCRIPTION = "Provides keyword/value list (or key-value list, for short) operations."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://kvlists.meta;md5=a32a790d218de49fb218adf78f9dd4ed"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/kvlists/kvlists-${PV}.tar.gz"

SRC_URI[md5sum] = "9647b69ccb7ad00498b37f43ac8c4cb1"
SRC_URI[sha256sum] = "7084920b294fa32f07632dd39b5da060a102d9685dca9fabd336bb13b3ab5dbb"

S = "${WORKDIR}/kvlists-${PV}"

require chicken-egg-kvlists.inc

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"

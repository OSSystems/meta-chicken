SECTION = "devel/chicken"
DESCRIPTION = "A more convenient form of define-record"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://defstruct.meta;md5=890e39714035b57ded3dd7859ebe2741"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "1011d237334a5997a4d09786c5b16104"
SRC_URI[sha256sum] = "ff4c51140eba1ad5435483fd5b88ee7e15c3871517b113bc6f0fb40db5e9c004"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
